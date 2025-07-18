package sqa.test;

import static org.junit.Assert.*;

import org.junit.Test;
import sqa.main.Ranking;
public class TestMembership {
	@Test
	public void testTC001() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 1, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC002() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 2, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC003() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 550);
		assertEquals("Gold",res);
	}

	@Test
	public void testTC004() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 6, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC005() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 7, 550);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC006() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 100);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC007() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 101);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC008() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 999);
		assertEquals("Gold",res);
	}
	
	@Test
	public void testTC009() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(55000, 4, 1000);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC010() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(10000, 4, 100);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC011() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(10001, 4, 101);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC012() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(99999, 4, 999);
		assertEquals("Gold",res);
	}
	
	@Test
	public void testTC013() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(100000, 4, 1000);
		assertEquals("Standard",res);
	}


}
