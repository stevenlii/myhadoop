package org.apache.hadoop.examples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

public class HDFSdemo {
	public static void main(String[] args) {
		FileSystem fs;
		try {
			fs = FileSystem.get(new URI("hdfs://www.paymoon.com:9000"),
					new Configuration());
			InputStream in = fs.open(new Path("/jdk"));

			FileOutputStream out = new FileOutputStream(new File(
					"/root/getdk"));

			IOUtils.copyBytes(in, out, 2048, true);
		} catch (IOException | URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
