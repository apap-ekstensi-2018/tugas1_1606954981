package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentMapper;
import com.example.model.Fakultas;
import com.example.model.Mahasiswa;
import com.example.model.ProgramStudi;
import com.example.model.Universitas;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceDatabase implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;



	@Override
	public Mahasiswa selectMahasiswa(String npm) {
		log.info("select mahasiswa with npm{}", npm);
		return studentMapper.selectMahasiswa(npm);
	}


	@Override
	public ProgramStudi selectProdi(int id) {
		log.info("select prodi");
		return studentMapper.selectProgramStudi(id);
	}


	@Override
	public Fakultas selectFakultas(int id) {
		log.info("select fakultas");
		return studentMapper.selectFakultas(id);
	}


	@Override
	public Universitas selectUniversitas(int id) {
		return studentMapper.selectUniversitas(id);
	}


	@Override
	public List<Mahasiswa> selectAllMahasiwa() {
		log.info("select all mahasiswa");
		return studentMapper.selectAllMahasiswa();
	}


	@Override
	public List<ProgramStudi> selectAllProgramStudi() {
		log.info("select all prodi");
		return studentMapper.selectAllProgramStudi();
	}


	@Override
	public List<Fakultas> selectAllFakultas() {
		log.info("select all fakultas");
		return studentMapper.selectAllFakultas();
	}


	@Override
	public List<Universitas> selectAllUniversitas() {
		log.info("select all universitas");
		return studentMapper.selectAllUniv();
	}


	@Override
	public String selectMahasiswaNpm(String npm) {
		return studentMapper.selectMahasiswaNpm (npm);
		
	}
	
	
	@Override
	public void tambahMahasiswa(Mahasiswa mahasiswa) {
		studentMapper.tambahMahasiswa(mahasiswa);
	}
	
	
	@Override
	public void updateMahasiswa(Mahasiswa mahasiswa) {
		studentMapper.updateMahasiswa(mahasiswa);
	}


	@Override
	public void deleteMahasiswa(String npm) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public Integer selectKelulusan(String tahun_masuk, int prodi) {
		// TODO Auto-generated method stub
		return studentMapper.selectKelulusan(tahun_masuk, prodi);
	}
	
	
	@Override
	public Integer selectTahunKelulusan(String tahun_masuk, int prodi) {
		// TODO Auto-generated method stub
		return studentMapper.selectTahunKelulusan(tahun_masuk, prodi);
	}


	@Override
	 public List <Fakultas> selectAllFakultasbyUniv(int id_univ){

	   return studentMapper.selectAllFakultasbyUniv(id_univ);

	  }
	 
	 
	 @Override
	 public List <ProgramStudi> selectProdibyFak(int id_fakultas){

	   return studentMapper.selectProdibyFak(id_fakultas);

	  }
	 
	 @Override
	 public List <Mahasiswa> selectMahasiswabyProdi(int id_prodi){

	   return studentMapper.selectMahasiswabyProdi(id_prodi);

	  }
	 

	@Override
	public int selectUniv(int id) {
		return studentMapper.selectUniv(id);
	}
	
	@Override
	public int selectFak(int id) {
		// TODO Auto-generated method stub
		return studentMapper.selectFak(id);
	}

}
