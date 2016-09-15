import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class SupersTest {


 @Test
 public void super_InstantiatesCorrectly_true() {
   Super newSuper = new Super("Metalneato",100,10,5,10);
   assertEquals(true, newSuper instanceof Super);
 }

 @Test
 public void super_getsLevel_1() {
   Super newSuper = new Super("Metalneato",100,10,5,10);
   assertEquals((Integer) 1, newSuper.getLevel());
 }
 // @Test
 // public void super_getsSupers_1() {
 //   Super newSuper = new Super("Metalneato",100,10,5,10);
 //   Super newSuper2 = new Super("Metalneato",100,10,5,10);
 //
 //   assertEquals(true, Super.all().contains(newSuper));
 //   assertEquals(true, Super.all().contains(newSuper2));
 // }
 @Test
 public void super_getsMetalNeato_Stats() {
   Super newSuper = new Super("Metalneato",100,10,5,10);
   assertEquals("Metalneato", newSuper.getSuperName());
   assertEquals((Integer) 100, newSuper.getHealth());
   assertEquals((Integer) 10, newSuper.getStrength());
   assertEquals((Integer) 5, newSuper.getAgility());
   assertEquals((Integer) 10, newSuper.getDefense());
 }
 @Test
 public void super_RosterWorks_True() {
   Game newGame = new Game()
   Game.addSupersRoster();
   ArrayList<Super> superRoster = Super.allRoster();
   assertEquals("Metalneato", superRoster.get(0).getSuperName());
   assertEquals((Integer) 100, superRoster.get(0).getHealth());
   assertEquals((Integer) 10, superRoster.get(0).getStrength());
   assertEquals((Integer) 5, superRoster.get(0).getAgility());
   assertEquals((Integer) 10, superRoster.get(0).getDefense());
 }



}
