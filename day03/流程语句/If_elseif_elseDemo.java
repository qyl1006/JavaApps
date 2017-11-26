//if-else-else语句
public class If_elseif_elseDemo
{
	public static void main(String[] args)
	{
		// 需要: 考试成绩如果大于90分,打印优; 如果大于80分,打印良; 如果大于70分,打印中; 其它的则打印多多努力
		int score = 58;

		if (score >= 90)
		{
			System.out.println("优");
		}
		else if (score >= 80 && score < 90)
		{
			System.out.println("良好");
		}
		else if (score >= 70 && score < 80)
		{
			System.out.println('中');
		}
		else
		{
			System.out.println("多多努力");
		}
	}
}