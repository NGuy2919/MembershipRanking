package sqa.test;

import static org.junit.Assert.*;

import org.junit.Test;
import sqa.main.Ranking;
public class TestMembership {
	@Test
	public void testTC001() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 0, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC002() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 1, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC003() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 500);
		assertEquals("Standard",res);
	}

	@Test
	public void testTC004() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 30, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC005() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 31, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC006() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 0);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC007() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15,1);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC008() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 999);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC009() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(50000, 15, 1000);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC010() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(0, 15, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC011() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(1, 15, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC012() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(99999, 15, 500);
		assertEquals("Standard",res);
	}
	
	@Test
	public void testTC013() {
		Ranking rank = new Ranking();
		String res = rank.CalculateMembershipRank(100000, 15, 500);
		assertEquals("Standard",res);
	}


}
