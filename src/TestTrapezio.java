import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTrapezio 
{
	Trapezio t;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.out.println("before class");
		
		
	}

	@AfterClass
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("after class");
	}
	

	@BeforeEach
	void setUp() throws Exception 
	{
		System.out.println("before each");
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		System.out.println("after each");
	}

	@Test
	void test1() 
	{
		t= new Trapezio(2, 1, 3);
		float risOttenuto =t.calcolaArea();
		float risAtteso = (float) 2.5;
		
		assertEquals(risAtteso, risOttenuto,0.001);
		fail("errore");
	}
	
	@Test
	void test2()
	{
		t= new Trapezio(5, 5, 6);
		float risOttenuto =t.calcolaArea();
		float risAtteso = (float) 27.5;
		
		assertEquals(risAtteso, risOttenuto,0.001);
		fail("errore");
		
	}
	
	@Test
	void test3()
	{
		t= new Trapezio(5, 1, 32);
		float risOttenuto =t.calcolaArea();
		float risAtteso = (float) 18.5;
		
		assertEquals(risAtteso, risOttenuto,0.001);
		fail("errore");
		
	}

}
