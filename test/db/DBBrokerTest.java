/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.Clan;
import domen.Mesto;
import domen.Trener;
import domen.Trening;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Milan
 */
public class DBBrokerTest {
    
    public DBBrokerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before   
    public void setUp() throws Exception {
        testUspostaviKonekcijuNaBazu();
    }
    
    @After
    public void tearDown() throws Exception {
        testRaskiniKonekciju();
    }

    /**
     * Test of uspostaviKonekcijuNaBazu method, of class DBBroker.
     */
    @Test
    public void testUspostaviKonekcijuNaBazu() throws Exception {
        System.out.println("uspostaviKonekcijuNaBazu");
        DBBroker instance = new DBBroker();
        instance.uspostaviKonekcijuNaBazu();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of raskiniKonekciju method, of class DBBroker.
     */
    @Test
    public void testRaskiniKonekciju() throws Exception {
        System.out.println("raskiniKonekciju");
        DBBroker instance = new DBBroker();
        instance.raskiniKonekciju();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of potvrdiTransakciju method, of class DBBroker.
     */
    @Test
    public void testPotvrdiTransakciju() throws Exception {
        System.out.println("potvrdiTransakciju");
        DBBroker instance = new DBBroker();
        instance.potvrdiTransakciju();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ponistiTransakciju method, of class DBBroker.
     */
    @Test
    public void testPonistiTransakciju() throws Exception {
        System.out.println("ponistiTransakciju");
        DBBroker instance = new DBBroker();
        instance.ponistiTransakciju();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class DBBroker.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        String column = "";
        Object value = null;
        int clanId = 0;
        DBBroker instance = new DBBroker();
        instance.update(column, value, clanId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllClanovi method, of class DBBroker.
     */
    @Test
    public void testGetAllClanovi() throws Exception {
        System.out.println("getAllClanovi");
        DBBroker instance = new DBBroker();
        List<Clan> expResult = null;
        List<Clan> result = instance.getAllClanovi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTreneri method, of class DBBroker.
     */
    @Test
    public void testGetAllTreneri() throws Exception {
        System.out.println("getAllTreneri");
        DBBroker instance = new DBBroker();
        List<Trener> expResult = null;
        List<Trener> result = instance.getAllTreneri();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gatAllTrening method, of class DBBroker.
     */
    @Test
    public void testGatAllTrening() throws Exception {
        System.out.println("gatAllTrening");
        DBBroker instance = new DBBroker();
        List<Trening> expResult = null;
        List<Trening> result = instance.gatAllTrening();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gatAllDatumi method, of class DBBroker.
     */
    @Test
    public void testGatAllDatumi() throws Exception {
        System.out.println("gatAllDatumi");
        DBBroker instance = new DBBroker();
        List<LocalDate> expResult = null;
        List<LocalDate> result = instance.gatAllDatumi();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAllClanAndTrenerZaTrening method, of class DBBroker.
     */
    @Test
    public void testSetAllClanAndTrenerZaTrening() throws Exception {
        System.out.println("setAllClanAndTrenerZaTrening");
        Trening trening = null;
        DBBroker instance = new DBBroker();
        instance.setAllClanAndTrenerZaTrening(trening);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllClan method, of class DBBroker.
     */
    @Test
    public void testGetAllClan() throws Exception {
        System.out.println("getAllClan");
        Trening trening = null;
        DBBroker instance = new DBBroker();
        List<Clan> expResult = null;
        List<Clan> result = instance.getAllClan(trening);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllTrener method, of class DBBroker.
     */
    @Test
    public void testGetAllTrener() throws Exception {
        System.out.println("getAllTrener");
        Trening trening = null;
        DBBroker instance = new DBBroker();
        List<Trener> expResult = null;
        List<Trener> result = instance.getAllTrener(trening);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllMesto method, of class DBBroker.
     */
    @Test
    public void testGetAllMesto() throws Exception {
        System.out.println("getAllMesto");
        DBBroker instance = new DBBroker();
        List<Mesto> expResult = null;
        List<Mesto> result = instance.getAllMesto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllVreme method, of class DBBroker.
     */
    @Test
    public void testGetAllVreme() throws Exception {
        System.out.println("getAllVreme");
        LocalDate datum = null;
        DBBroker instance = new DBBroker();
        List<Trening> expResult = null;
        List<Trening> result = instance.getAllVreme(datum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertClan method, of class DBBroker.
     */
    @Test
    public void testInsertClan() throws Exception {
        System.out.println("insertClan");
        Clan clan = null;
        DBBroker instance = new DBBroker();
        instance.insertClan(clan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obrisiClana method, of class DBBroker.
     */
    @Test
    public void testObrisiClana() throws Exception {
        System.out.println("obrisiClana");
        Clan clan = null;
        DBBroker instance = new DBBroker();
        instance.obrisiClana(clan);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of vratiMaxId method, of class DBBroker.
     */
    @Test
    public void testVratiMaxId() throws Exception {
        System.out.println("vratiMaxId");
        DBBroker instance = new DBBroker();
        int expResult = 0;
        int result = instance.vratiMaxId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertClanOnTraining method, of class DBBroker.
     */
    @Test
    public void testInsertClanOnTraining() throws Exception {
        System.out.println("insertClanOnTraining");
        Clan c = null;
        Trening trening = null;
        DBBroker instance = new DBBroker();
        instance.insertClanOnTraining(c, trening);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
