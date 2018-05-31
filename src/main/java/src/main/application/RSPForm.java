package src.main.application;

import java.util.Random;

public class RSPForm {
	private String rsp;
	String result;
	String com;
	Random r =new Random();


	public void setRsp(String rsp) {
		this.rsp = rsp;
	}
	public String getRsp() {
		return rsp;
	}


	public String result(){
		int a=r.nextInt(2);
		switch(a) {
		case 0:
			com="rock";
			break;
		case 1:
			com="paper";
			break;
		case 2:
			com="scissors";
			break;
		default:
			com="Error";
			break;
		}
		if(rsp=="scissors"&&com=="rock"){
			 result="あなたの負け";
		}else if(rsp=="rock"&&com=="paper") {
			result="あなたの負け";
		}else if(rsp=="paper"&&com=="scissors") {
			result="あなたの負け";
		}else if(rsp=="rock"&&com=="scissors") {
			 result="あなたの勝ち";
		}else if(rsp=="scissors"&&com=="paper") {
			result="あなたの勝ち";
		}else if(rsp=="paper"&&com=="rock") {
			result="あなたの勝ち";
		}else if(rsp==null) {
			result="値が正しくとれていません";
		}else {
			 result="あいこ";
		}
		return result;
	}
}
