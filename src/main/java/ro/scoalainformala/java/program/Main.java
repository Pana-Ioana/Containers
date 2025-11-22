package ro.scoalainformala.java.program;

import ro.scoalainformala.java.data.App;
import ro.scoalainformala.java.data.Services;
import ro.scoalainformala.java.model.*;
import ro.scoalainformala.java.factory.PersonSetFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        App init = new App();
        Services service = new Services();
        service.run(init);
    }
}
