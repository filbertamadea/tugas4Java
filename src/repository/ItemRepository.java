package repository;

import Model.Item;
import Services.kasirService;

import java.util.ArrayList;

public class ItemRepository implements kasirService<Item, Integer> {

    ArrayList<Item> items = new ArrayList<>();

    @Override
    public ArrayList<Item> findAll() {
        return items;
    }

    @Override
    public Item findById(Integer id) {
        return items.get(id);
    }

    @Override
    public void save(Item data) {
        items.add(data);
    }

    @Override
    public int index() {
        return items.size() -1;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void update(Integer data, Integer id) {
        items.get(id).setJumlah(String.valueOf(data));
    }


    @Override
    public void delete(Integer id) {
        items.remove(findById(id));
    }

    @Override
    public int getBiaya(Integer data, Integer id) {
        int total = items.get(id).getTotal(data);
        return total;
    }
}
