﻿using System;
using System.Collections.Generic;
using System.Text;

namespace RegistroCitas.Model {
    public class Patient {
        public int ID { get; set; }
        public String DNI { get; set; }
        public String Name { get; set; }
        public String Surnames { get; set; }
        public String Adress { get; set; }
        public String Email { get; set; }
    }
}