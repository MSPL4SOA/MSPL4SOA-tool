Car : Body Engine+ Injection Gear [KeylessEntry] [Powerlocks] :: CarGroup;

Gear : Automatic | Manual :: GearGroup ;

Engine: Gas | Electric :: EngineGroup;


%%

not Electric or not Manual;
KeylessEntry implies Powerlocks;
