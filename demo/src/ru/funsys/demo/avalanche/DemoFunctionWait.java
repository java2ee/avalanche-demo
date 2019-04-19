/**
 * 
 */
package ru.funsys.demo.avalanche;

import java.util.Hashtable;
import java.util.Random;

/**
 * @author ivc_Lihovskihvv
 *
 */
public class DemoFunctionWait extends DemoFunction {

	public long wait = 10000L;
	
	/**
	 * 
	 */
	public DemoFunctionWait() {
		// TODO Auto-generated constructor stub
	}

	public void setWait(String wait) {
		this.wait = Long.parseLong(wait);
	}
	
	@Override
	public Hashtable<String, String> getInfo() {
		try {
			wait(new Random(wait).nextLong());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return super.getInfo();
	}

}
