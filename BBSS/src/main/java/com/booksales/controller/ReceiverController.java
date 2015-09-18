package com.booksales.controller;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.booksales.model.Receiver;
import com.booksales.model.User;
import com.booksales.service.ReceiverServiceI;

@Controller
@RequestMapping()
public class ReceiverController {
	@Autowired
	ReceiverServiceI receiverService;
	
	private static Log logger = LogFactory.getLog(ReceiverController.class);
	
	@RequestMapping(value = "/addReceiver", method = RequestMethod.GET)
	public String addReceiver() {
		logger.info("GET-----添加收货地址----");
		return "receiver/addReceiver";
	}
	@RequestMapping(value = "/addReceiver", method = RequestMethod.POST)
	public String addReceiver2(User user,
			@RequestParam("userid")String userid,
			@RequestParam("receivername")String receivername,
			@RequestParam("receivertel")String receivertel,
			@RequestParam("province")String province,
			@RequestParam("city")String city,
			@RequestParam("area")String area,
			@RequestParam("receiveraddress2")String receiveraddress2,
			Model model) throws JsonGenerationException, JsonMappingException, IOException {
		
		logger.info("POST-----添加收货地址----");
		
		Receiver receiver = new Receiver();
		receiver.setUserid(Integer.parseInt(userid));
		receiver.setReceivername(receivername);
		receiver.setReceivertel(receivertel);
		String receiveraddress = province+city+area+receiveraddress2;
		receiver.setReceiveraddress(receiveraddress);
		
	 int i=	receiverService.addReceiver(receiver);
		
		logger.info(userid);
		logger.info(receivername);
		logger.info(receivertel);
		logger.info(province);
		logger.info(city);
		logger.info(area);
		logger.info(receiveraddress2);
		
		
		return "showUser";
	}
}
