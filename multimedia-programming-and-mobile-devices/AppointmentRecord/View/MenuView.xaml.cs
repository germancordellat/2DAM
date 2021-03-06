﻿using AppointmentRecord.View;
using AppointmentRecord.ViewModel;
using RegistroCitas.Model;
using RegistroCitas.ViewModel;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace RegistroCitas.View {
    [XamlCompilation(XamlCompilationOptions.Compile)]
    public partial class MenuView : ContentPage {

        public static Patient Patient { get; set; }
        public MenuView()
        {
            InitializeComponent();
        }

        private void REGISTER_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new RegisterAppointmentView
            {
                BindingContext = new RegisterAppointmentViewModel()
            });

        }

        private void MANAGE_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new ManageAppointmentView
            {
                BindingContext = new ManageAppointmentViewModel()
            });
        }

        private void HISTORY_Clicked(object sender, EventArgs e)
        {
            Navigation.PushAsync(new HistoryAppointmentView
            {
                BindingContext = new HistoryAppointmentViewModel()
            });
        }
    }
}