package com.realdolmen.secondjava9app;

import com.realdolmen.firstjava9app.exporting.MyExportingClazz;

public class MyCaller {
    public static void main(String[] args) {
        callExportingClazz();
        callNonExportingClazz();
    }

    private static void callExportingClazz() {
        MyExportingClazz.main(null);
    }

    private static void callNonExportingClazz() {
        // The line below is not exported, so you won't be able to call it:
//        MyNonExportingClazz.main(null);
    }
}
