package com.st.node;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * Demo
 *
 * @author ST
 */
public class TransferDateFormat extends UDF {


    /**
     * 重载
     *
     * @param input
     * @return
     */
    public int evaluate(int input) {
        return input * 10;
    }


}
