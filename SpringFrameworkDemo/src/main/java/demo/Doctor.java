package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

// 不能直接使用，因为spring还不知道我们创建了这个component

//@Scope (scopeName = "prototype")
@Component
// 默认的Scope是singleton
public class Doctor implements Staff, BeanNameAware, InitializingBean {
    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void assist () {
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean name method is called");
    }

    @PostConstruct
    public void postConstruct () {
        System.out.println("Post Construct Method is called");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("afterPropertiesSet Method is called");
    }

    public void initMethod () {
        System.out.println("initMethod Method is called");
    }
}
