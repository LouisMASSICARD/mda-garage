package tech.becoming.mda.one.anemic;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
public class Place {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    @JoinColumn
    private String password;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
