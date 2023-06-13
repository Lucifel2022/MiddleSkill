import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		// 改行
		System.out.println("問１");
		// 問題1:現在の時刻を出力してください

		Date d = new Date();

		System.out.println(d);

		// 改行
		System.out.println("問２");
		// 問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。

		try {
			SimpleDateFormat sds = new SimpleDateFormat("yyyy/MM/dd");
			SimpleDateFormat sdm = new SimpleDateFormat("yyyy/MM/dd");

			Date date1 = sds.parse(shinyaBirthday);
			Date date2 = sdm.parse(minamiBirthday);

//			System.out.println(date1);
//			System.out.println(date2);

			if (date1.compareTo(date2) < 0) {

				String str = new SimpleDateFormat("yyyy/MM/dd").format(date1);
				System.out.println(str);
			}

		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		// 改行
		System.out.println("問３");
		// 問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい

		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date date3 = sdf.parse(furuyamaBirthday);
			Calendar cl = Calendar.getInstance();
			cl.setTime(date3);
			cl.add(Calendar.YEAR, 5);
			cl.add(Calendar.MONTH, 2);
			System.out.println(sdf.format(cl.getTime()));

		} catch (ParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

	}
}
