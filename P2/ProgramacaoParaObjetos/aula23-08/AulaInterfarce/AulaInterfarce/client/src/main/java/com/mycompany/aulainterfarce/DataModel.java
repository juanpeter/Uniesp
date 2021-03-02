package com.mycompany.aulainterfarce;

import net.java.html.json.ComputedProperty;
import net.java.html.json.Function;
import net.java.html.json.Model;
import net.java.html.json.Property;
import net.java.html.json.ModelOperation;
import net.java.html.json.OnPropertyChange;
@Model(className = "Data", targetId = "", instance = true, properties = {
})
final class DataModel {
    /**
     * Called when the page is ready.
     */
    static void onPageLoad() {
        Data ui = new Data();
        ui.applyBindings();
    }
}
