public class GithubProject{
	public static void main(String args[]){
		InterfaceZub inter = (x)->{
				return (x == (Math.sqrt(x)*Math.sqrt(x)));
			};
			System.out.println(inter.isPerfectSquare(4f));
	}
}

interface InterfaceZub{
	public boolean isPerfectSquare(float x);
}