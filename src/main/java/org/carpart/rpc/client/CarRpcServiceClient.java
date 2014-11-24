package org.carpart.rpc.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.carpart.rpc.CarRpcService;

public class CarRpcServiceClient {
	private static final String orderCode="";
	private static final String clientCode="";
	private static final String clientKey="";
	private static final String SERVICE_URL = "http://pandaz.wicp.net/CarPart/rpc/webservice/CarRpcService";

	public static void main(String[] args) {
		queryOrderStatus();
	}

	private static void queryOrderStatus() {
		JaxWsProxyFactoryBean j = new JaxWsProxyFactoryBean();
		j.setAddress(SERVICE_URL);
		j.setServiceClass(CarRpcService.class);
		CarRpcService hw = (CarRpcService) j.create();
		System.out.println(hw.queryOrderStatus(orderCode, clientCode, clientKey));
	}
	
	private static void addNewOrder() {
		JaxWsProxyFactoryBean j = new JaxWsProxyFactoryBean();
		j.setAddress(SERVICE_URL);
		j.setServiceClass(CarRpcService.class);
		CarRpcService hw = (CarRpcService) j.create();
	}

}
