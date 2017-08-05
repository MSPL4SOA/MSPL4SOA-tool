TShirt : Color Pattern Size :: TShirtGroup;

Color : Red | Black | White | Pink :: ColorGroup ;

Pattern : ACDC | Metallica | Britney :: Pattern;

Size : S | L | XL | XXL :: SizeGroup; 

%%

not(Britney and Black);
ACDC implies not Pink;
Metallica implies not Pink;
ACDC implies (XL or XXL);


