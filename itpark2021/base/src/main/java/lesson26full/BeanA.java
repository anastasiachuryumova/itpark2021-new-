package lesson26full;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

@Getter
@Setter
public class BeanA {

    private BeanB bean;

    public void setBean (@Lazy BeanB bean) {
        this.bean = bean;
    }

    public void print () {
        System.out.println(bean);
    }
}
