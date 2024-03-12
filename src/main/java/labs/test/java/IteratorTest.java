import org.example.LabsTP.LabN3.iterator.Item;
import org.example.LabsTP.LabN3.iterator.ItemType;
import org.example.LabsTP.LabN3.iterator.Iterator;
import org.example.LabsTP.LabN3.iterator.TreasureChest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {

    public static List<Object[]> dataProvider() {
        return Arrays.asList(
                new Object[]{new Item(ItemType.POTION, "Potion of courage")},
                new Object[]{new Item(ItemType.RING, "Ring of shadows")},
                new Object[]{new Item(ItemType.POTION, "Potion of wisdom")},
                new Object[]{new Item(ItemType.POTION, "Potion of blood")},
                new Object[]{new Item(ItemType.WEAPON, "Sword of silver +1")},
                new Object[]{new Item(ItemType.POTION, "Potion of rust")},
                new Object[]{new Item(ItemType.POTION, "Potion of healing")},
                new Object[]{new Item(ItemType.RING, "Ring of armor")},
                new Object[]{new Item(ItemType.WEAPON, "Steel halberd")},
                new Object[]{new Item(ItemType.WEAPON, "Dagger of poison")}
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void test(Item expectedItem) {
        final TreasureChest chest = new TreasureChest();
        final Iterator<Item> iterator = chest.iterator(expectedItem.getType());
        assertNotNull(iterator);

        while (iterator.hasNext()) {
            final Item item = iterator.next();
            assertNotNull(item);
            assertEquals(expectedItem.getType(), item.getType());

            final String name = item.toString();
            assertNotNull(name);
            if (expectedItem.toString().equals(name)) {
                return;
            }
        }
        fail("Expected to find item [" + expectedItem + "] using iterator, but we didn't.");
    }
}