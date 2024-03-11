package org.example.LabsTP.LabN3.iterator;

import java.util.List;

public class TreasureChestItemIterator implements Iterator<Item> {

    private final TreasureChest chest;
    private final ItemType type;

    private int idx;

    public TreasureChestItemIterator(
            TreasureChest chest,
            ItemType type
    ) {
        this.chest = chest;
        this.type = type;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return -1 != findNextIdx();
    }

    @Override
    public Item next() {
        idx = findNextIdx();
        if (-1 != idx)
            return chest.getItems().get(idx);

        return null;
    }

    private int findNextIdx() {
        List<Item> items = chest.getItems();
        int tempIdx = idx;
        while (true) {
            tempIdx++;
            if (tempIdx >= items.size()) {
                tempIdx = -1;
                break;
            }

            if (type.equals(ItemType.ANY)
                    || items.get(tempIdx).getType().equals(type)) {
                break;
            }
        }
        return tempIdx;
    }

}
