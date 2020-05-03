package xyz.mofangserver.stusys.functions;

import xyz.mofangserver.stusys.main.*;
import xyz.mofangserver.stusys.template.*;

/**
 * @author z_yu
 * @version 0.1
 * @serial SASYS(StudentAdminSystem)
 * @since 0.1
 */
public class PrintInfo {
	@SuppressWarnings("static-access")
	public final void printInfo(int NoNum, Student[] arr) {
		Main a = new Main();
		Admin a1 = new Admin();
		if (a1.exist(NoNum, arr[NoNum])) {
			if (a.stuArr[NoNum].getName() != null && a.stuArr[NoNum].getAge() != 0
					&& a.stuArr[NoNum].getGender() != '\u0000' && a.stuArr[NoNum].getEnterDate() != null
					&& a.stuArr[NoNum].getEducatenum() != 0) {
				System.out.println("=====��" + NoNum + "��ѧ������Ϣ=====");
				System.out.println("����:\t" + a.stuArr[NoNum].getName());
				System.out.println("����:\t" + a.stuArr[NoNum].getAge());
				System.out.println("�Ա�:\t" + a.stuArr[NoNum].getGender());
				System.out.println("��ѧʱ��:\t" + a.stuArr[NoNum].getEnterDate());
				System.out.println("ѧ����:\t" + a.stuArr[NoNum].getEducatenum());
			} else {
				System.err.println("��Ҫ��ӡ��Ϣ,���Ϊ\t" + NoNum + "��ѧ����Ϣ������!����!");
			}
		} else {
			System.err.println("ѧ��������!");
		}
	}

	@SuppressWarnings("static-access")
	public final void printTeaInfo(int NoNum, Teacher[] arr) {
		TeacherAdmin a1 = new TeacherAdmin();
		Main a = new Main();
		if (a1.exist(NoNum, arr[NoNum])) {
			if (a.teaArr[NoNum].getName() != null && a.teaArr[NoNum].getAge() != 0
					&& a.teaArr[NoNum].getGender() != '\u0000' && a.teaArr[NoNum].getGetProjDate() != null) {
				System.out.println("=====��" + NoNum + "�Ž�ʦ����Ϣ=====");
				System.out.println("����:\t" + a.teaArr[NoNum].getName());
				System.out.println("����:\t" + a.teaArr[NoNum].getAge());
				System.out.println("�Ա�:\t" + a.teaArr[NoNum].getGender());
				System.out.println("��ְʱ��:\t" + a.teaArr[NoNum].getGetProjDate());
				System.out.println("��ѧ��Ŀ:\t" + a.teaArr[NoNum].getProj());
				System.out.println("��ѧ�༶:\t" + a.teaArr[NoNum].getClassProj());
			} else {
				System.err.println("��Ҫ��ӡ��Ϣ,���Ϊ\t" + NoNum + "�Ľ�ʦ��Ϣ������!����!");
			}
		} else {
			System.err.println("��ʦ������!");
		}
	}

	@SuppressWarnings("static-access")
	public final void printAdmInfo(int NoNum, Administrators[] arr) {
		AdministratorsAdmin a1 = new AdministratorsAdmin();
		Main a = new Main();
		if (a1.exist(NoNum, arr[NoNum])) {
			if (a.admArr[NoNum].getName() != null && a.admArr[NoNum].getAge() != 0
					&& a.admArr[NoNum].getGender() != '\u0000' && a.admArr[NoNum].getGetJobDate() != null) {
				System.out.println("=====��" + NoNum + "�Ź�����Ա����Ϣ=====");
				System.out.println("����:\t" + a.admArr[NoNum].getName());
				System.out.println("����:\t" + a.admArr[NoNum].getAge());
				System.out.println("�Ա�:\t" + a.admArr[NoNum].getGender());
				System.out.println("��ְʱ��:\t" + a.admArr[NoNum].getGetJobDate());
				System.out.println("ְ��:\t" + a.admArr[NoNum].getJob());
				System.out.println("����༶:\t" + a.admArr[NoNum].getAdminClasses());
			} else {
				System.err.println("��Ҫ��ӡ��Ϣ,���Ϊ\t" + NoNum + "�Ĺ�����Ա��Ϣ������!����!");
			}
		} else {
			System.err.println("������Ա������!");
		}
	}
}
