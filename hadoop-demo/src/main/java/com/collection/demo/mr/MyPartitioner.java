package com.collection.demo.mr;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

/**
 * 自定义分区
 */
public class MyPartitioner extends Partitioner<Text, IntWritable>{
    @Override
    public int getPartition(Text text, IntWritable intWritable, int numPartitions) {
        System.out.println("MyPartitioner");
        return 0;
    }
}
