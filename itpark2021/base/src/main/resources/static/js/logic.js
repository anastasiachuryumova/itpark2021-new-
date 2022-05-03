$(function () {
    var element = {
        'field1' : 'example',
        'value' : 125
    };
    let elementAsString = JSON.stringify(element);
    JSON.parse(elementAsString);
    $('#inputText').blur(function () {
        let val = $(this).val();
        if (!val) {
            $('#errorLabel').css('display', 'block');
        } else {
            $('#errorLabel').hide();
        }
    });
});