import com.practicaljava.lesson7.Goods;
import com.practicaljava.lesson7.Tshirts;
import com.practicaljava.lesson7.Shoes;


public class SetDiscount {

	public static void main(String[] args) {

        Goods clothes[] = new Goods[3];
		clothes[0] = new Shoes("Adidas");
		clothes[1] = new Tshirts("Puma");
		clothes[2] = new Shoes("Nike");

		for (Goods p: clothes){

			System.out.println(p.getName());
			p.setDiscount();
		}
	}
}
