package com.spring11.controller;

import java.io.IOException;
import java.util.*;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.spring11.dto.Classroom;
import com.spring11.dto.Store;
import com.spring11.dto.Student;
import com.spring11.vo.Maker;
@RestController
@RequestMapping("/api/")
public class RestfulController {
	//응답은 json으로 
	
	private static final Logger log = LoggerFactory.getLogger(RestfulController.class);
	
	@GetMapping("api1.do")
	public Store getApi1() {
		Store store = new Store(1, "Emart");
		return store;
	}
		
	@GetMapping("api2.do")
	public Store getApi2() {
		Store store = new Store(1, "Emart");
		return store;
	}
	
		
	@GetMapping("api3.do")
	public List<Store> getApi3() {
		Store store1 = new Store(1, "Emart");
		Store store2 = new Store(2, "Costco");
		Store store3 = new Store(3, "Lottemart");
		List<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		return storeList;
	}
	
	@GetMapping("api4.do")
	public Maker getApi4() {
		Store store1 = new Store(1, "Emart");
		Store store2 = new Store(2, "Costco");
		Store store3 = new Store(3, "Lottemart");
		ArrayList<Store> storeList = new ArrayList<>();
		storeList.add(store1);
		storeList.add(store2);
		storeList.add(store3);
		Maker maker = new Maker("GreatMall", 1);
		return maker;
	}
	
		
	@GetMapping("api5.do")
	public Store postApi5(@RequestBody Store store) {
		return store;
		
	}
	
	@PostMapping("api6.do")
	public String postStudent(@RequestBody Student std) {
		String response = String.format("\n<학생 정보>\n이름 : %s\n번호 : %d\n나이 : %d", std.getName(), std.getStdNumber(), std.getAge());
		log.info("postStudent response : " +response);
		return response;
	}
	
	@PostMapping("api7.do")
	public String postAllStudent(@RequestBody List<Student> stds) {
		String response = "\n<학급 정보>\n";
		int i = 1;
		for(Student s : stds) {
			response += String.format("학생%d: 이름 : %s\t번호 : %d\t나이 : %d\n", i, s.getName(), s.getStdNumber(), s.getAge());
			i++;
		}
		log.info("postAllStudent response : " +response);
		return response;
	}
	
	@PostMapping("api8.do")
	public String postClassroom(@RequestBody Classroom team) {
		String response = String.format("\n<팀 정보>\n학과명 : %s\n반 : %d\n", team.getPart(), team.getClassNum());
		int i = 1;
		for(Student s : team.getStudents()) {
			response += String.format("학생%d: 이름 : %s\t번호 : %d\t나이 : %d\n", i, s.getName(), s.getStdNumber(), s.getAge());
			i++;
		}
		log.info("postClassroom response : " +response);
		return response;
	}
	
	 @PostMapping("api9.do") //simple-json을 활용한 JsonString -> Student
	    public Student convertStringToStudent1(@RequestBody String jsonStr) throws ParseException {
	        JSONParser jsonParser = new JSONParser();
	        JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonStr);

	        Student std = new Student(Integer.valueOf(jsonObject.get("stdNumber").toString()),
	                jsonObject.get("name").toString(),
	                Integer.valueOf(jsonObject.get("age").toString()));
	        log.info("convertStringToStudent1 response : "+std);
	        return std;
	    }

	    //simple-json을 활용한 Student -> JsonString
	    @PostMapping(value="api10.do", produces="application/json;charset=UTF-8")    
	    public String convertStudentToString1(@RequestBody Student std) {
	        JSONObject jsonPlayer = new JSONObject();
	        jsonPlayer.put("stdNumber", std.getStdNumber());
	        jsonPlayer.put("name", std.getName());
	        jsonPlayer.put("age", std.getAge());
	        String jsonStr = jsonPlayer.toJSONString();
	        log.info("convertStudentToString1 result : "+jsonStr);
	        return jsonStr;
	    }
	    /* 여기 까지는 simple-json 라이브러리 사용한 Receive & Transfer */
	    
	    /* 여기 부터는 Gson 라이브러리 사용한 Receive & Transfer */
	    @PostMapping(value="api11.do", produces="application/json;charset=UTF-8") //gson을 활용한 JsonString -> Student
	    public Student convertStringToStudent2(@RequestBody String jsonStr) {
	        Gson gson = new Gson();
	        Student std = gson.fromJson(jsonStr, Student.class);
	        log.info("convertStringToStudent2 result : "+std);
	        return std;
	    }

	    //gson을 활용한 JsonString -> Classroom
	    @PostMapping(value="api12.do", produces="application/json;charset=UTF-8") 
	    public Classroom convertStringToClassroom2(@RequestBody String jsonStr) {
	        Gson gson = new Gson();
	        Classroom team = gson.fromJson(jsonStr, Classroom.class);
	        log.info("convertStringToClassroom2 result : "+team);
	        return team;
	    }

	    //gson을 활용한 Classroom -> JsonString
	    @PostMapping(value="api13.do", produces="application/json;charset=UTF-8")
	    public String convertClassroomToString2(@RequestBody Classroom team) {
	        Gson gson = new Gson();
	        String jsonStr = gson.toJson(team);
	        log.info("convertClassroomToString2 : "+jsonStr);
	        return jsonStr;
	    }
	    /* 여기 까지는 Gson 라이브러리 사용한 Receive & Transfer */
	    
	    /* 여기 부터는 jackson 라이브러리 사용한 Receive & Transfer */
	    @PostMapping(value="api14.do", produces="application/json;charset=UTF-8")   //jackson을 활용한 JsonString -> Classroom
	    public Classroom convertStringToClassroom3(@RequestBody String jsonStr) throws IOException {
	        ObjectMapper objectMapper = new ObjectMapper();
	        Map<String, Object> teamMap = objectMapper.readValue(jsonStr, new TypeReference<>(){});
	        Classroom team = new Classroom(
	                teamMap.get("part").toString(),
	                Integer.valueOf(teamMap.get("classNum").toString()),
	                (ArrayList<Student>) teamMap.get("students"));
	        log.info("convertStringToClassroom3 result : "+team);
	        return team;
	    }

	    @PostMapping(value="api15.do", produces="application/json;charset=UTF-8") //jackson을 활용한 Classroom -> JsonString
	    public String convertClassroomToString3(@RequestBody Classroom team) throws JsonProcessingException {
	        ObjectMapper objectMapper = new ObjectMapper();
	        String jsonStr = objectMapper.writeValueAsString(team);
	        log.info("convertClassroomToString3 result : "+jsonStr);
	        return jsonStr;
	    }
	    /* 여기 까지는 jackson 라이브러리 사용한 Receive & Transfer */
	}