public class AbstractMain{
	public static void main(String[] args ){


		Phone oppo=new Oppo();
		oppo.memory=64;
		oppo.name="oppoF11";
		oppo.playMusic();
		oppo.playVideo();
		oppo.features();


		Vivo v=new Vivo();
		v.memory=32;
		v.name="Vivomaxpro";
		v.playMusic();
        v.playVideo();
        v.features();

	}
	
}


abstract class Phone{
	int memory;
	String name;
	abstract void playVideo();
	abstract void playMusic();
	void features(){
		System.out.println("inside features Function");
	}
}


class Oppo extends Phone{
	@Override
	void playVideo(){
		System.out.println("playing video from oppo.");
	}
	@Override
	void playMusic(){
		System.out.println("wow! what a music .");

	}
}


class Vivo extends Phone{
	@Override
	void playVideo(){
		System.out.println("HD video is being played in Vivo.");
	}
	@Override
	void playMusic(){
		System.out.println("wow! what a music is being played in Oppo.");
	}
	@Override
	void features(){
		System.out.println("Vivo's features are awesome.");

	}

	
}
