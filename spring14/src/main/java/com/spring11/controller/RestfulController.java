package com.spring11.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring11.dto.Store;
import com.spring11.vo.Maker;

@RestController
public class RestfulController {
	//응답은 json으로 
	
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

}
