package basicKnowledge.serializable;

import java.io.*;

/**
 * @基本功能:
 * @program:summary
 * @author:peicc
 * @create:2019-09-19 18:48:35
 **/
public class TestSerializable implements Externalizable {
    public TestSerializable() {
        super();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
