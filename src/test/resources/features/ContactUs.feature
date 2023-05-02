Feature: Contact Us  Test

  @wip
  Scenario Outline: Negative Test
    Given The User is on the contact us page
    When The user logs in using "<name>" and"<eMail>"
    Then The warning message contains'<mesaj>'
    Examples:
      | name | eMail               | mesaj                    |
      |      |                     | Lütfen bu alani doldurun |
      |      | gulgunfeyman@gmail. | Lütfen bu alani doldurun |
      |      | gulgunfeyman@       | Lütfen bu alani doldurun |
      |      | gulgunfeyman        | Lütfen bu alani doldurun |