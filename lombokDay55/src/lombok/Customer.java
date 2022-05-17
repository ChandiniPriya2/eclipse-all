package lombok;



@NoArgsConstructor
@AllArgsConstructor

//@ToString
//@EqualsAndHashCode
//@ReqArgsConstructor
@Data
public class Customer {
	
	@Setter
	@Getter
	@NonNull
private long custId;
	@Setter
	@Getter
private String name;
	@Setter
	@Getter
private double balance;

}
