package be.intecbrussel.business;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Size(min = 1)
    private String message;

    @NotNull
    @Size(min = 1)
    private String username;

}
