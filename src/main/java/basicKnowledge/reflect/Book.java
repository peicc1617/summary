package basicKnowledge.reflect;

import jdk.nashorn.internal.objects.annotations.Setter;

import javax.annotation.Resource;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-29 21:21:22
 **/
@Resource
public class Book {
    private int id;
    private int name;
    private int price;
    public String title;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Resource
    private int testPrivteMethod(){
        return 1;
    }
}
