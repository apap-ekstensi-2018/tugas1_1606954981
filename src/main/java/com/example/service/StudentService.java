package com.example.service;

import java.util.List;

import com.example.model.Fakultas;
import com.example.model.Mahasiswa;
import com.example.model.ProgramStudi;
import com.example.model.Universitas;

public interface StudentService
{
    Mahasiswa selectMahasiswa (String npm);
    ProgramStudi selectProdi (int id);
    Fakultas selectFakultas (int id);
    Universitas selectUniversitas (int id);
    String selectMahasiswaNpm(String npm);
    
    
    int selectUniv (int id);
    int selectFak (int id);
    
    
    List<Mahasiswa> selectAllMahasiwa();
    List<ProgramStudi> selectAllProgramStudi();
    List<Fakultas> selectAllFakultas();
    List<Universitas> selectAllUniversitas();
    List <Fakultas> selectAllFakultasbyUniv(int id_univ);
    List <ProgramStudi> selectProdibyFak(int id_fakultas);
    List <Mahasiswa> selectMahasiswabyProdi(int id_prodi);
    
    
	void tambahMahasiswa(Mahasiswa mahasiswa);
	void updateMahasiswa (Mahasiswa mahasiswa);
    void deleteMahasiswa (String npm);
    Integer selectKelulusan (String tahun_masuk, int prodi);
    Integer selectTahunKelulusan (String tahun_masuk, int prodi);
    
}
