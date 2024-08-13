package cl.bethelper.main.util;

import cl.bethelper.main.vo.Response;

import java.util.Comparator;

public class ComparableSortingFixture implements Comparator<Response> {
    @Override
    public int compare(Response o1, Response o2) {
        return o2.getFixture().getDate().compareTo(o1.getFixture().getDate());
    }
}
