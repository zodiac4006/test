package test.javascript;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class javascript_dom {

	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.parse(new File("EmploymentInfo.html"), "UTF-8");
		doc.getElementById("title_postion").html("平面设计/产品设计");
		doc.getElementById("title_employ_nums").html("招聘5人");
		doc.getElementById("title_employ_money").html("3k-5K/月");
		doc.getElementById("title_employ_company").html("小付钱包技术（北京）有限公司（北京）");
		doc.getElementById("work_welfare").html("带薪年假，五险一金，定期体检，餐补，通讯补，交通补助");
		doc.getElementById("work_trade").html("互联网");
		doc.getElementById("work_direction").html("设计");
		doc.getElementById("work_skill").html("网页设计,平面设计,美术设计,广告设计,助理");
		doc.getElementById("work_year").html("1年以上");
		doc.getElementById("work_education").html("本科及以上");
		doc.getElementById("hrm_name").html("林先生");
		doc.getElementById("hrm_phone").html("18688888888");
		doc.getElementById("hrm_email").html("superlin@XX.com");
		doc.getElementById("work_remark").html("掌握一定外语。留学经验者优先！<br>无经验者OK！<br>有一定的审美水品！熟练使用设计、作图软件，愿意接触平面及产品、网页等的设计工作。<br>热爱学习，吃苦耐劳，积极主动。&nbsp;");
		System.out.println(doc.html());
	}

}
