package com.booksales.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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

	/**
	 * 
	 * @param userid
	 * @param receivername
	 * @param receivertel
	 * @param province
	 * @param city
	 * @param area
	 * @param placeDetail
	 * @param postalcode
	 * @param model
	 * @return
	 */
	
	@RequestMapping(value = "AddReceiver", method = RequestMethod.POST)
	public void addReceiver4(
			@RequestParam("userid") String userid,
			@RequestParam("receivername") String receivername,
			@RequestParam("receivertel") String receivertel,
			@RequestParam(value = "province", required = false) String province,
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "area", required = false) String area,
			@RequestParam("placeDetail") String placeDetail,
			@RequestParam("postalcode") String postalcode,HttpServletResponse response) {
		
		logger.info("POST 异步请求-----添加收货地址----");

		Receiver receiver = new Receiver();
		System.out.println(province);
		System.out.println(city);
		System.out.println(area);
		System.out.println(placeDetail);
		
		
		receiver.setUserid(Integer.parseInt(userid));
		receiver.setReceivername(receivername);
		receiver.setReceivertel(receivertel);
		String receiveraddress = new String();
		
		
		if(province.equals("0"))
			province="";
		if(city.equals("0"))
			city="";
		if(area.equals("0"))
			area="";
		
		receiveraddress = province + city+area + placeDetail;
		
		receiver.setReceiveraddress(receiveraddress);
		receiver.setReceivercode(postalcode);
		int i = receiverService.addReceiver(receiver);
		
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		String result = new String();
		
		if(i>0){
			result="<li><div><input name='addr' type='radio' value="+receiver.getReceiverid()+">"
					+"<span>"+receivername+"</span>"
					+"<span>"+receiveraddress+"</span>"
					+"<span>"+receivertel+"</span></div></li>";
		}
		PrintWriter out = null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(result);
		out.close();			
	}

	@RequestMapping(value = "/addReceiver/{userid}", method = RequestMethod.GET)
	public String addReceiver(@PathVariable Integer userid, Model model) {

		logger.info("GET-----添加收货地址----");
		model.addAttribute("userid", userid);

		return "receiver/addReceiver";
	}

	@RequestMapping(value = "/addReceiver/Receiver", method = RequestMethod.POST)
	public String addReceiver3(

			@RequestParam("userid") String userid,
			@RequestParam("receivername") String receivername,
			@RequestParam("receivertel") String receivertel,
			@RequestParam(value = "province", required = false) String province,
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "area", required = false) String area,
			@RequestParam("receiveraddress2") String receiveraddress2,
			Model model) {

		logger.info("POST-----添加收货地址----");

		Receiver receiver = new Receiver();
		receiver.setUserid(Integer.parseInt(userid));
		receiver.setReceivername(receivername);
		receiver.setReceivertel(receivertel);
		String receiveraddress = province + city + area + receiveraddress2;
		receiver.setReceiveraddress(receiveraddress);

		int i = receiverService.addReceiver(receiver);

		return "redirect:/showUser";
	}

	@RequestMapping(value = "/addReceiver", method = RequestMethod.POST)
	public String addReceiver2(
			User user,
			@RequestParam("userid") String userid,
			@RequestParam("receivername") String receivername,
			@RequestParam("receivertel") String receivertel,
			@RequestParam(value = "province", required = false) String province,
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "area", required = false) String area,
			@RequestParam("receiveraddress2") String receiveraddress2,
			Model model) throws JsonGenerationException, JsonMappingException,
			IOException {

		logger.info("POST-----添加收货地址----");

		Receiver receiver = new Receiver();
		receiver.setUserid(Integer.parseInt(userid));
		receiver.setReceivername(receivername);
		receiver.setReceivertel(receivertel);
		String receiveraddress = province + city + area + receiveraddress2;
		receiver.setReceiveraddress(receiveraddress);

		int i = receiverService.addReceiver(receiver);

		logger.info(userid);
		logger.info(receivername);
		logger.info(receivertel);
		logger.info(province);
		logger.info(city);
		logger.info(area);
		logger.info(receiveraddress2);
		return "redirect:showAdmin";
	}

	@RequestMapping(value = "/listUserReceiver/{userid}", method = RequestMethod.GET)
	public String listUserReceiver(@PathVariable Integer userid, Model model) {
		List<Receiver> receiverlist = receiverService
				.SelectReceiverByUserId(userid);
		model.addAttribute("receiverlist", receiverlist);
		return "receiver/listReceiver";
	}

	@RequestMapping(value = "listCart/addReceiver", method = RequestMethod.POST)
	public String addRec(
			@RequestParam("userid") String userid,
			@RequestParam("receivername") String receivername,
			@RequestParam("receivertel") String receivertel,
			@RequestParam(value = "province", required = false) String province,
			@RequestParam(value = "city", required = false) String city,
			@RequestParam(value = "area", required = false) String area,
			@RequestParam("placeDetail") String placeDetail,
			@RequestParam("postalcode") String postalcode,

			Model model) {
		Receiver receiver = new Receiver();
		System.out.println("用户id：" + userid);
		receiver.setUserid(Integer.parseInt(userid));
		receiver.setReceivername(receivername);
		receiver.setReceivertel(receivertel);
		String receiveraddress = province + city + area + placeDetail;
		receiver.setReceiveraddress(receiveraddress);
		receiver.setReceivercode(postalcode);

		int i = receiverService.addReceiver(receiver);

		return "redirect:addOrder";

	}

}
