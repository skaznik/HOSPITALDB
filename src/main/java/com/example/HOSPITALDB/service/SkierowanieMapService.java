//package com.example.HOSPITALDB.service;
//
//import com.example.HOSPITALDB.model.SkierowanieDoLekarza;
//import lombok.SneakyThrows;
//import org.springframework.stereotype.Service;
//
//
//import java.util.*;
//import java.util.concurrent.atomic.AtomicInteger;
//
//@Service
//public class SkierowanieMapService implements SkierowanieService {
//
//    private static final AtomicInteger atomicInteger = new AtomicInteger();
//    private Map<Integer, SkierowanieDoLekarza> skierowania = new HashMap<>();
//
//
//    @Override
//    public Collection<SkierowanieDoLekarza> listSkierowanie() {
//        return skierowania.values();
//    }
//
//    @SneakyThrows
//    @Override
//    public SkierowanieDoLekarza getSkierowanie(Integer id)  {
//        SkierowanieDoLekarza skierowanieDoLekarza = skierowania.get(id);
//        if (skierowanieDoLekarza == null) {
//            throw new TestController.NotFoundException();
//        }
//        return skierowanieDoLekarza;
//    }
//
//    @Override
//    public void deleteSkierowanie(Integer id) {
//        skierowania.remove(id);
//    }
//
//    @Override
//    public SkierowanieDoLekarza createSkierowanie(SkierowanieDoLekarza skierowanie) {
//
//        skierowanie.setId(new Random().nextInt());
//        skierowania.put(skierowanie.getId(), skierowanie);
//        return skierowanie;
//    }
//
//    @Override
//    public SkierowanieDoLekarza updateSkierowanie(SkierowanieDoLekarza skierowanie) {
//        SkierowanieDoLekarza existing = getSkierowanie(skierowanie.getId());
//        existing.setLekarz(skierowanie.getLekarz());
//        existing.setPacjent(skierowanie.getPacjent());
//        existing.setTermin(skierowanie.getTermin());
//        ;
//        skierowania.put(existing.getId(), existing);
//
//        return existing;
//    }
//}
