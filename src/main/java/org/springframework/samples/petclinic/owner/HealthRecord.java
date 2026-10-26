package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;

import org.springframework.samples.petclinic.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "health_records")
public class HealthRecord extends BaseEntity {

    @Column(name = "weight")
    private Double weight;

    @Column(name = "vaccinated")
    private Boolean vaccinated;

    @Column(name = "last_checkup_date")
    private LocalDate lastCheckupDate;

    // 一对一关联到宠物
    @OneToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public LocalDate getLastCheckupDate() {
        return lastCheckupDate;
    }

    public void setLastCheckupDate(LocalDate lastCheckupDate) {
        this.lastCheckupDate = lastCheckupDate;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
