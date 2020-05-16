import HM11.Collect;
import org.junit.Assert;
import org.junit.jupiter.api.Test;


class CollectTest {
   private final Collect collect = new Collect();
    @Test
    void add() {
        collect.add("Test");
        String expected = "Test";
        Assert.assertEquals(expected, collect.getIndex(0)); //сравнивает тот ли элемент в коллекции
                                                           //что и в expected
        int expected1 = 1;
        Assert.assertEquals(expected1,collect.getSize()); //сравнивает количество элементов в коллекции
                                                          //что и в expected
    }

    @Test
    void delete() {
        collect.add("1");
        collect.add("2");
        collect.delete(0);
        int expected = 1;
        Assert.assertEquals(expected,collect.getSize()); //сравнивает количество элементов в коллекции
                                                         //что и в expected
        String expected1 = "2";
        Assert.assertEquals(expected1,collect.getIndex(0)); //сравнивает тот ли элемент в коллеции
                                                            //что и в expected
    }

    @Test
    void getIndex() {
        collect.add("LOL");
        final String expected = collect.getIndex(0);
        Assert.assertEquals(expected,"LOL");
    }

    @Test
    void contains() {
    collect.add("Check");
    collect.add("Chec");
    final boolean expected = collect.contains("Check");
        Assert.assertTrue(expected);
    }

    @Test
    void equals() {
        Collect collect1 = new Collect();
        collect1.add("123");
        collect.add("321");
//        collect.add("321");
        final boolean expected = collect.equals(collect1);
        final boolean actual = true;
        Assert.assertEquals(expected,actual);
    }

    @Test
    void clear() {
        collect.add("1");
        collect.add("1");
        int expected = collect.clear();
        int actual = collect.getSize();
        Assert.assertEquals(expected,actual);
    }

    @Test
    void indexOf() {
    collect.add("Проверка");
    collect.add("Проверка1");
    int actual = collect.indexOf("Проверка1");
    int expected = 1;
    Assert.assertEquals(expected,actual);
    }

    @Test
    void getSize() {
        collect.add("1");
        collect.add("2");
        final int actual = collect.getSize();
        final int expected = 2;
        Assert.assertEquals(expected,actual);
    }

    @Test
    void check() {

    }
}