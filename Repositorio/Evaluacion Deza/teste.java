import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class teste{

	@Test
	void Ordeen(){
		Sube subesita = new Sube();

		subesita.setpago(240);
		subesita.setmetros(480);
		subesita.setusos(13);
		assertTrue(subesita.verifico());
		}

		@Test
		void Ordeen1(){
		Sube subesita1 = new Sube();

		subesita1.setpago(120);
		subesita1.setmetros(480);
		subesita1.setusos(30);
		assertTrue(subesita1.verifico());
		}
		@Test
		void Desordeen(){
		Sube subesita2 = new Sube();

		subesita2.setpago(240);
		subesita2.setmetros(480);
		subesita2.setusos(30);
		assertFalse(subesita2.verifico());
		}

		@Test
		void Desordeen1(){
		Sube subesita3 = new Sube();

		subesita3.setpago(40);
		subesita3.setmetros(480);
		subesita3.setusos(15);
		assertFalse(subesita3.verifico());
		}

		@Test
		void Desordeen2(){
		Sube subesita4 = new Sube();

		subesita4.setpago(0);
		subesita4.setmetros(480);
		subesita4.setusos(6);
		assertFalse(subesita4.verifico());
		}

	
}