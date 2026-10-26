package org.springframework.samples.petclinic.owner;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HealthRecordRepository extends JpaRepository<HealthRecord, Integer> {
    // 根据宠物 ID 查找健康档案
    HealthRecord findByPetId(Integer petId);
}
