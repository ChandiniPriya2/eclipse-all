package ai.jobiak.ioc;

import java.util.Map;

public class Question {
private Map<String,String>ans;

public Map<String, String> getAns() {
	return ans;
}

public void setAns(Map<String, String> ans) {
	this.ans = ans;
}

@Override
public String toString() {
	return "Question [ans=" + ans + "]";
}

}
