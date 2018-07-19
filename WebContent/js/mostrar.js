$(document).ready(function () {
	 $("#tblArticulo").DataTable({
		 responsive:true,
		 autoWidth: false,
		 fixedColumns: true,
		 oLanguage : {
				sLengthMenu	: "Mostrar _MENU_ registros",
				sZeroRecords: "No se encontraron resultados",
				sInfo		: "Mostrando del _START_ al _END_ de un total de _TOTAL_ registros",
				sInfoEmpty	: "Registros del 0 al 0 de un total de 0 registros",
				sEmptyTable	: '<i>No hay informacion requerida</i>',
				sSearch		: "Buscar: ",
				sInfoFiltered: "(filtrado de un total de _MAX_ registros)",
				sLoadingRecords: "Cargando...",
				oPaginate : {
				"sFirst":    "Primero",
		        "sLast":     "Ultimo",
		        "sNext":     "Siguiente >",
		        "sPrevious": "< Anterior"
				},
				oAria: {
					sSortAscending: ": Activar para ordenar la columna de manera ascendente",
					sSortDescending: ": Activar para ordenar la columna de manera descendente"
				}
			},
			ordering			:	true,
			bScrollAutoCss		:	true,
			bStateSave			:	false,
			bAutoWidth			:	false,
			bScrollCollapse		:	false,
			searching			:	true,
			paging				:	true,
			pagingType			:   "full_numbers",
			iDisplayLength		:	50,
			responsive			:	true,
			bLengthChange		: 	false
	 });
});
