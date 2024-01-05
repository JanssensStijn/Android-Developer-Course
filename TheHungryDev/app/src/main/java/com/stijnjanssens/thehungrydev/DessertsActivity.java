package com.stijnjanssens.thehungrydev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DessertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desserts);

        ListView dessertsList = findViewById(R.id.list_view_desserts);

        Dish[] dishes = {

                new Dish("Bean and kale soup","Bean and fresh kale combined into smooth soup",  5.10),
                new Dish("Cabbage and chicken dumplings","Thin pastry cases stuffed with fresh cabbage and free range chicken",  4.75),
                new Dish("Sole and persimmon dumplings","Thin pastry cases stuffed with sole and fresh persimmon",  7.99),
                new Dish("Mussel and kohlrabi soup", "Mussel and kohlrabi combined into creamy soup", 5.99),
                new Dish("Mint and haddock soup", "Dried mint and smoked haddock combined into smooth soup", 4.75),
                new Dish("Egusi and pepper soup", "Egusi and yellow pepper combined into creamy soup", 6.75),
                new Dish("Peppercorn and sausage parcels", "Thin filo pastry cases stuffed with mixed peppercorn and chunky sausage", 9.75),
                new Dish("Egg and cauliflower soup", "Free range eggs and fresh cauliflower combined into creamy soup", 9.99),
                new Dish("Pigeon and sweetcorn parcels", "Thin filo pastry cases stuffed with pigeon and baby sweetcorn",6.99),
                new Dish("Horseradish and cabbage wontons", "Thin wonton cases stuffed with fresh horseradish and chinese cabbage", 5.64),
                new Dish("Sweetcorn and trout wontons", "Thin wonton cases stuffed with creamed sweetcorn and smoked trout", 6.45),
                new Dish("Mustard seed and melon soup", "Yellow mustard seeds and ogen melon combined into chunky soup", 8.79),
                new Dish("Mushroom and kiwi fruit dip", "A dip made from crimini mushroom and fresh kiwi fruit", 5.67),
                new Dish("Chickpea and apple parcels", "Thin filo pastry cases stuffed with fresh chickpea and bramley apple", 4.56),
                new Dish("Steak and pasta soup", "Steak and macaroni pasta combined into creamy soup", 3.45),
                new Dish("Aubergine and chilli dip", "A dip made from fried aubergine and scotch bonnet chilli", 1.25),
                new Dish("Yoghurt and truffle soup", "Live yoghurt and truffle combined into chunky soup", 4.35),
                new Dish("Chorizo and coconut soup", "Spanish chorizo and fresh coconut combined into creamy soup", 6.66),
                new Dish("Rosemary and tofu parcels","Thin filo pastry cases stuffed with dried rosemary and smoked tofu",  8.25),
                new Dish("Shrimp and courgette soup", "Shrimp and yellow courgette combined into creamy soup", 8.88)
        };

        ArrayAdapter<Dish> dishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishes);
        dessertsList.setAdapter(dishesAdapter);
    }
}