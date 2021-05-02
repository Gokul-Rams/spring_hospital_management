package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Patients {
	int id;
	String name;
	String condition;
	Boolean inpatient;
	
	@Autowired
	public Patients(Idtracker idtrack) {
		id = idtrack.nextpatientid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Boolean getInpatient() {
		return inpatient;
	}

	public void setInpatient(Boolean inpatient) {
		this.inpatient = inpatient;
	}
}
