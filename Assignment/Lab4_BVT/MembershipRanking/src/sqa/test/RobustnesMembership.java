package sqa.test;

import static org.junit.Assert.*;

import org.junit.Test;

import sqa.main.Ranking;

public class RobustnesMembership {

	@Test
	public void testTC014() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 0, 550);
		assertEquals("Standard",res);
	}

	@Test
	public void testTC015() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 1, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC016() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 2, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC017() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 550);
		assertEquals("Gold",res);
	}

	@Test
	public void testTC018() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 6, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC019() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 7, 550);
		assertEquals("Standard",res);
	}
	@Test
	public void testTC020() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 8, 550);
		assertEquals("Standard",res);
	}

	@Test
	public void testTC021() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 99);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC022() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 100);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC023() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 101);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC024() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 999);
		assertEquals("Gold",res);
	}
	
	@Test
	public void testTC025() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 1000);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC026() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 1001);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC027() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(9999, 4, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC028() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(10000, 4, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC029() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(10001, 4, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC030() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(99999, 4, 550);
		assertEquals("Gold",res);
	}
	
	@Test
	public void testTC031() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(100000, 4, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC032() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(100001, 4, 550);
		assertEquals("Standard",res);
	}
}
