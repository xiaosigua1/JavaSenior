package com.xdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 
 * ʧȥһ������,���û�����;��
 *  
 * @author С�а趹��
 * 2017-10-26����3:53:36
 * 
 * 
 * Excel��ĵ��� ===�������
 */
public class ExcelDemo {

	public static void main(String[] args) {

		// ����Excel�ļ���Ӧ�Ķ���
		HSSFWorkbook hw = new HSSFWorkbook();
		// ����sheet
		HSSFSheet sheet = hw.createSheet("�ɼ���");
		// ͨ��sheet����row 0-65535
		HSSFRow row1 = sheet.createRow(0);
		HSSFRow row2 = sheet.createRow(1);
		HSSFRow row3 = sheet.createRow(2);
		// ͨ��row����cell 0-255
		HSSFCell c1 = row1.createCell(0);
		HSSFCell c2 = row2.createCell(1);
		HSSFCell c3 = row3.createCell(2);
		// һ��cell����һ����Ԫ��
		c1.setCellValue("��1�еĵ�1��");
		c2.setCellValue("��2�еĵ�2��");
		c3.setCellValue("��3�еĵ�3��");
		// ��������� ������д�� ����
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("e:/myExcel.xls");
			hw.write(fos); // �ļ�������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
